package com.contactlab.dati.dati.service;

import com.contactlab.dati.dati.data.UtenteCopyDb;
import com.contactlab.dati.dati.data.UtenteDb;
import com.contactlab.dati.dati.metod.MetodiUtili;
import com.contactlab.dati.dati.repository.UtentiCopyRepository;
import com.contactlab.dati.dati.repository.UtentiRepository;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TransactionService {

    private static final Logger logger = LoggerFactory.getLogger(TransactionService.class);


    @Autowired
    private UtentiRepository utentiRepository;

    @Autowired
    private UtentiCopyRepository utentiCopyRepository;


    @Transactional
    public void modifyUtenteTable(UtenteDb utenteDb) {

            logger.info("Creo utente per clienti_copy nel db");
            UtenteCopyDb utenteCopyDb = new UtenteCopyDb();

            utenteCopyDb.setId(utenteDb.getProgressiveId());

            utenteCopyDb.setUid(utenteDb.getUid());
            utenteCopyDb.setEmail(utenteDb.getEmail());
            utenteCopyDb.setAge(utenteDb.getAge());

            String day = utenteDb.getBirthday();
            String month = utenteDb.getBirthmonth();
            String year = utenteDb.getBirthyear();

            if (StringUtils.isNotBlank(day) && StringUtils.isNotBlank(month) && StringUtils.isNotBlank(year)) {
                utenteCopyDb.setDob(MetodiUtili.createDate(day, month, year));

            }

            utenteCopyDb.setCity(utenteDb.getCity());
            utenteCopyDb.setCountry(utenteDb.getCountry());
            utenteCopyDb.setFirstname(utenteDb.getFirstname());
            utenteCopyDb.setLastname(utenteDb.getLastname());
            utenteCopyDb.setGender(utenteDb.getGender());
            utenteCopyDb.setZip(utenteDb.getZip());
            utenteCopyDb.setCodProvince(utenteDb.getCodProvince());

            utenteCopyDb.setDvDesktopCount(utenteDb.getDvDesktopCount());
            utenteCopyDb.setDvDesktopLast(utenteDb.getDvDesktopLast());
            utenteCopyDb.setDvMobileCount(utenteDb.getDvMobileCount());
            utenteCopyDb.setDvMobileLast(utenteDb.getDvMobileLast());
            utenteCopyDb.setDvTabletCount(utenteDb.getDvTabletCount());
            utenteCopyDb.setDvTabletLast(utenteDb.getDvTabletLast());

            utenteCopyDb.setLastlogindate(utenteDb.getLastLoginDate());


            String mobilephone = utenteDb.getMobilephone();

            if (mobilephone.contains("+39")) {

                utenteCopyDb.setMobilephone(mobilephone);

            } else {

                if (StringUtils.isNotBlank(mobilephone)) {

                    String mobilephoneSistemato = MetodiUtili.isValid(mobilephone);

                    if (!mobilephoneSistemato.equalsIgnoreCase(utenteDb.getMobilephone())) {
                        utenteCopyDb.setMobilephone(mobilephoneSistemato);
                    }

                } else {
                    utenteCopyDb.setMobilephone(" ");
                }
            }

            utenteCopyDb.setPrBauli(utenteDb.getPrBauli());
            utenteCopyDb.setPrMotta(utenteDb.getPrMotta());
            utenteCopyDb.setPrBuondi(utenteDb.getPrBuondi());
            utenteCopyDb.setPrGirella(utenteDb.getPrGirella());
            utenteCopyDb.setPrYoyo(utenteDb.getPrYoyo());
            utenteCopyDb.setPrCiocori(utenteDb.getPrCiocori());
            utenteCopyDb.setPrDoria(utenteDb.getPrDoria());
            utenteCopyDb.setPrBistefani(utenteDb.getPrBistefani());
            utenteCopyDb.setPrAlemagna(utenteDb.getPrAlemagna());
            utenteCopyDb.setPrCasalini(utenteDb.getPrCasalini());
            utenteCopyDb.setPrBauligroup(utenteDb.getPrBauligroup());

            utenteCopyDb.setPreferred_retailer(utenteDb.getPreferredRetailer());
            utenteCopyDb.setPrivacy_profiling(utenteDb.getPrivacyProfiling());
            utenteCopyDb.setPrivacy_recall(utenteDb.getPrivacyRecall());
            utenteCopyDb.setRegistration_initiative(utenteDb.getRegistrationInitiative());

            String telephone = utenteDb.getTelephone();

            if (telephone.contains("+39")) {
                utenteCopyDb.setTelephone(telephone);
            } else {

                if (StringUtils.isNotBlank(telephone) && telephone.length() >= 10) {

                    String telephoneSistemato = MetodiUtili.isValid(telephone);

                    if (!telephoneSistemato.equalsIgnoreCase(utenteDb.getTelephone())) {
                        utenteCopyDb.setTelephone(telephoneSistemato);
                    }

                } else {
                    utenteCopyDb.setTelephone(" ");
                }
            }

            utenteCopyDb.setIs_active(utenteDb.getIsActive());
            utenteCopyDb.setIs_registered(utenteDb.getIsRegistered());
            utenteCopyDb.setIs_verified(utenteDb.getIsVerified());
            utenteCopyDb.setLogin_provider(utenteDb.getLoginProvider());
            utenteCopyDb.setSocial_providers(utenteDb.getSocialProviders());
            utenteCopyDb.setStatus_user(utenteDb.getStatusUser());
            utenteCopyDb.setAddress(utenteDb.getAddress());

            utenteCopyDb.setCategory_index_biscuits(utenteDb.getCategoryIndexBiscuits());
            utenteCopyDb.setCategory_index_minicakes(utenteDb.getCategoryIndexMinicakes());
            utenteCopyDb.setCategory_index_savoury(utenteDb.getCategoryIndexSavoury());
            utenteCopyDb.setCategory_index_seasonal(utenteDb.getCategoryIndexSeasonal());
            utenteCopyDb.setTaste_index_chocolover(utenteDb.getTasteIndexChocolover());
            utenteCopyDb.setTaste_index_creamlover(utenteDb.getTasteIndexCreamlover());
            utenteCopyDb.setTaste_index_fillinglover(utenteDb.getTasteIndexFillinglover());
            utenteCopyDb.setTaste_index_fruitlover(utenteDb.getTasteIndexFruitlover());
            utenteCopyDb.setTaste_index_plainlover(utenteDb.getTasteIndexPlainlover());
            utenteCopyDb.setTaste_index_savourylover(utenteDb.getTasteIndexSavourylover());
            utenteCopyDb.setLast_update_date(utenteDb.getLastUpdateDate());
            utenteCopyDb.setOptin_date(utenteDb.getOptinDate());
            utenteCopyDb.setPrivacy_store(utenteDb.getPrivacyStore());
            utenteCopyDb.setRegistation_date(utenteDb.getRegistationDate());
            utenteCopyDb.setValassis_uid(utenteDb.getValassisUid());
            utenteCopyDb.setProcessed(0);

            utentiCopyRepository.save(utenteCopyDb);

            logger.info("Utente copia salvato");

            utenteDb.setProcessed(1);

            utentiRepository.save(utenteDb);
            logger.info("Utente aggiornato con processed 1");

    }
}
