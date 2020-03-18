package com.contactlab.dati.dati.data;

import javax.persistence.*;


@Entity
@Table(name = "clienti")
public class UtenteDb
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "progressive_id")
    private int progressiveId;
    private int processed;
    private String uid;
    private String email;
    private String age;
    private String birthday;
    private String birthmonth;
    private String birthyear;
    private String city;
    private String country;
    private String firstname;
    private String lastname;
    private String gender;
    private String  zip;
    @Column(name = "codprovince")
    private String codProvince;
    @Column(name = "dv_desktopcount")
    private String dvDesktopCount;
    @Column(name = "dv_desktoplast")
    private String dvDesktopLast;
    @Column(name = "dv_mobilecount")
    private String dvMobileCount;
    @Column(name = "dv_mobilelast")
    private String dvMobileLast;
    @Column(name = "dv_tabletcount")
    private String dvTabletCount;
    @Column(name = "dv_tabletlast")
    private String dvTabletLast;
    @Column(name = "lastlogindate")
    private String lastLoginDate;
    @Column(name = "mobilephone")
    private String mobilephone;
    private String prBauli;
    private String prMotta;
    private String prBuondi;
    private String prGirella;
    private String prYoyo;
    private String prCiocori;
    private String prDoria;
    private String prBistefani;
    private String prAlemagna;
    private String prCasalini;
    private String prBauligroup;
    @Column(name = "preferredretailer")
    private String preferredRetailer;
    @Column(name = "privacyprofiling")
    private String privacyProfiling;
    @Column(name = "privacyrecall")
    private String privacyRecall;
    @Column(name = "registrationinitiative")
    private String registrationInitiative;
    private String  telephone;
    @Column(name = "isactive")
    private String isActive;
    @Column(name = "isregistered")
    private String isRegistered;
    @Column(name = "isverified")
    private String isVerified;
    @Column(name = "loginprovider")
    private String loginProvider;
    @Column(name = "socialproviders")
    private String socialProviders;
    @Column(name = "statususer")
    private String statusUser;
    private String  address;
    @Column(name = "categoryindex_biscuits")
    private String categoryIndexBiscuits;
    @Column(name = "categoryindex_minicakes")
    private String categoryIndexMinicakes;
    @Column(name = "categoryindex_savoury")
    private String categoryIndexSavoury;
    @Column(name = "categoryindex_seasonal")
    private String categoryIndexSeasonal;
    @Column(name = "tasteindex_chocolover")
    private String tasteIndexChocolover;
    @Column(name = "tasteindex_creamlover")
    private String tasteIndexCreamlover;
    @Column(name = "tasteindex_fillinglover")
    private String tasteIndexFillinglover;
    @Column(name = "tasteindex_fruitlover")
    private String tasteIndexFruitlover;
    @Column(name = "tasteindex_plainlover")
    private String tasteIndexPlainlover;
    @Column(name = "tasteindex_savourylover")
    private String tasteIndexSavourylover;
    @Column(name = "LASTUPDATEDDATE")
    private String lastUpdateDate;
    @Column(name = "optindate")
    private String optinDate;
    @Column(name = "privacystore")
    private String privacyStore;
    @Column(name = "registrationdate")
    private String registationDate;
    private String valassisUid;


    public UtenteDb() {
    }

    public UtenteDb(int processed, String uid, String email, String age, String birthday, String birthmonth, String birthyear, String city,
                    String country, String firstname, String lastname, String gender, String zip,
                    String codprovince, String dvDesktopCount, String dv_desktop_last, String dv_mobilecount,
                    String dv_mobilelast, String dvTabletCount, String dvTabletlast, String lastLoginDate,
                    String mobilephone, String prBauli, String prMotta, String prBuondi, String prGirella,
                    String prYoyo, String prCiocori, String prDoria, String prBistefani, String prAlemagna,
                    String prCasalini, String prBauligroup, String preferredRetailer, String privacy_profiling,
                    String privacyRecall, String registrationInitiative, String telephone, String isActive,
                    String isRegistered, String isVerified, String loginProvider, String socialProviders,
                    String statusUser, String address, String categoryIndexBiscuits, String categoryIndexMinicakes,
                    String categoryIndexSavoury, String categoryIndexSeasonal, String tasteIndexChocolover,
                    String tasteIndexCreamlover, String tasteIndexFillinglover, String taste_index_fruitlover,
                    String tasteIndexPlainlover, String tasteIndexSavourylover, String lastUpdateDate,
                    String optinDate, String privacyStore, String registationDate, String valassisUid) {

        this.processed = processed;
        this.uid = uid;
        this.email = email;
        this.age = age;
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
        this.city = city;
        this.country = country;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.zip = zip;
        this.codProvince = codprovince;
        this.dvDesktopCount = dvDesktopCount;
        this.dvDesktopLast = dv_desktop_last;
        this.dvMobileCount = dv_mobilecount;
        this.dvMobileLast = dv_mobilelast;
        this.dvTabletCount = dvTabletCount;
        this.dvTabletLast = dvTabletlast;
        this.lastLoginDate = lastLoginDate;
        this.mobilephone = mobilephone;
        this.prBauli = prBauli;
        this.prMotta = prMotta;
        this.prBuondi = prBuondi;
        this.prGirella = prGirella;
        this.prYoyo = prYoyo;
        this.prCiocori = prCiocori;
        this.prDoria = prDoria;
        this.prBistefani = prBistefani;
        this.prAlemagna = prAlemagna;
        this.prCasalini = prCasalini;
        this.prBauligroup = prBauligroup;
        this.preferredRetailer = preferredRetailer;
        this.privacyProfiling = privacy_profiling;
        this.privacyRecall = privacyRecall;
        this.registrationInitiative = registrationInitiative;
        this.telephone = telephone;
        this.isActive = isActive;
        this.isRegistered = isRegistered;
        this.isVerified = isVerified;
        this.loginProvider = loginProvider;
        this.socialProviders = socialProviders;
        this.statusUser = statusUser;
        this.address = address;
        this.categoryIndexBiscuits = categoryIndexBiscuits;
        this.categoryIndexMinicakes = categoryIndexMinicakes;
        this.categoryIndexSavoury = categoryIndexSavoury;
        this.categoryIndexSeasonal = categoryIndexSeasonal;
        this.tasteIndexChocolover = tasteIndexChocolover;
        this.tasteIndexCreamlover = tasteIndexCreamlover;
        this.tasteIndexFillinglover = tasteIndexFillinglover;
        this.tasteIndexFruitlover = taste_index_fruitlover;
        this.tasteIndexPlainlover = tasteIndexPlainlover;
        this.tasteIndexSavourylover = tasteIndexSavourylover;
        this.lastUpdateDate = lastUpdateDate;
        this.optinDate = optinDate;
        this.privacyStore = privacyStore;
        this.registationDate = registationDate;
        this.valassisUid = valassisUid;
    }

    public void setDvDesktopLast(String dvDesktopLast) {
        this.dvDesktopLast = dvDesktopLast;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getProgressiveId() {
        return progressiveId;
    }

    public void setProgressiveId(int progressive_id) {
        this.progressiveId = progressive_id;
    }

    public int getProcessed() {
        return processed;
    }

    public void setProcessed(int processed) {
        this.processed = processed;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCodProvince() {
        return codProvince;
    }

    public void setCodProvince(String codprovince) {
        this.codProvince = codprovince;
    }

    public String getDvDesktopCount() {
        return dvDesktopCount;
    }

    public void setDvDesktopCount(String dv_desktopcount) {
        this.dvDesktopCount = dv_desktopcount;
    }

    public String getDvDesktopLast() {
        return dvDesktopLast;
    }

    public void setDv_desktoplast(String dv_desktoplast) {
        this.dvDesktopLast = dv_desktoplast;
    }

    public String getDvMobileCount() {
        return dvMobileCount;
    }

    public void setDvMobileCount(String dv_mobilecount) {
        this.dvMobileCount = dv_mobilecount;
    }

    public String getDvMobileLast() {
        return dvMobileLast;
    }

    public void setDvMobileLast(String dv_mobilelast) {
        this.dvMobileLast = dv_mobilelast;
    }

    public String getDvTabletCount() {
        return dvTabletCount;
    }

    public void setDvTabletCount(String dv_tabletcount) {
        this.dvTabletCount = dv_tabletcount;
    }

    public String getDvTabletLast() {
        return dvTabletLast;
    }

    public void setDvTabletLast(String dv_tabletlast) {
        this.dvTabletLast = dv_tabletlast;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastlogindate) {
        this.lastLoginDate = lastlogindate;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getPrBauli() {
        return prBauli;
    }

    public void setPrBauli(String pr_bauli) {
        this.prBauli = pr_bauli;
    }

    public String getPrMotta() {
        return prMotta;
    }

    public void setPrMotta(String pr_motta) {
        this.prMotta = pr_motta;
    }

    public String getPrBuondi() {
        return prBuondi;
    }

    public void setPrBuondi(String pr_buondi) {
        this.prBuondi = pr_buondi;
    }

    public String getPrGirella() {
        return prGirella;
    }

    public void setPrGirella(String pr_girella) {
        this.prGirella = pr_girella;
    }

    public String getPrYoyo() {
        return prYoyo;
    }

    public void setPrYoyo(String pr_yoyo) {
        this.prYoyo = pr_yoyo;
    }

    public String getPrCiocori() {
        return prCiocori;
    }

    public void setPrCiocori(String pr_ciocori) {
        this.prCiocori = pr_ciocori;
    }

    public String getPrDoria() {
        return prDoria;
    }

    public void setPrDoria(String pr_doria) {
        this.prDoria = pr_doria;
    }

    public String getPrBistefani() {
        return prBistefani;
    }

    public void setPrBistefani(String pr_bistefani) {
        this.prBistefani = pr_bistefani;
    }

    public String getPrAlemagna() {
        return prAlemagna;
    }

    public void setPrAlemagna(String pr_alemagna) {
        this.prAlemagna = pr_alemagna;
    }

    public String getPrCasalini() {
        return prCasalini;
    }

    public void setPrCasalini(String pr_casalini) {
        this.prCasalini = pr_casalini;
    }

    public String getPrBauligroup() {
        return prBauligroup;
    }

    public void setPrBauligroup(String pr_bauligroup) {
        this.prBauligroup = pr_bauligroup;
    }

    public String getPreferredRetailer() {
        return preferredRetailer;
    }

    public void setPreferredRetailer(String preferred_retailer) {
        this.preferredRetailer = preferred_retailer;
    }

    public String getPrivacyProfiling() {
        return privacyProfiling;
    }

    public void setPrivacyProfiling(String privacy_profiling) {
        this.privacyProfiling = privacy_profiling;
    }

    public String getPrivacyRecall() {
        return privacyRecall;
    }

    public void setPrivacyRecall(String privacy_recall) {
        this.privacyRecall = privacy_recall;
    }

    public String getRegistrationInitiative() {
        return registrationInitiative;
    }

    public void setRegistrationInitiative(String registration_initiative) {
        this.registrationInitiative = registration_initiative;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String is_active) {
        this.isActive = is_active;
    }

    public String getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(String is_registered) {
        this.isRegistered = is_registered;
    }

    public String getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(String is_verified) {
        this.isVerified = is_verified;
    }

    public String getLoginProvider() {
        return loginProvider;
    }

    public void setLoginProvider(String login_provider) {
        this.loginProvider = login_provider;
    }

    public String getSocialProviders() {
        return socialProviders;
    }

    public void setSocialProviders(String social_providers) {
        this.socialProviders = social_providers;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(String status_user) {
        this.statusUser = status_user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategoryIndexBiscuits() {
        return categoryIndexBiscuits;
    }

    public void setCategoryIndexBiscuits(String category_index_biscuits) {
        this.categoryIndexBiscuits = category_index_biscuits;
    }

    public String getCategoryIndexMinicakes() {
        return categoryIndexMinicakes;
    }

    public void setCategoryIndexMinicakes(String category_index_minicakes) {
        this.categoryIndexMinicakes = category_index_minicakes;
    }

    public String getCategoryIndexSavoury() {
        return categoryIndexSavoury;
    }

    public void setCategoryIndexSavoury(String category_index_savoury) {
        this.categoryIndexSavoury = category_index_savoury;
    }

    public String getCategoryIndexSeasonal() {
        return categoryIndexSeasonal;
    }

    public void setCategoryIndexSeasonal(String category_index_seasonal) {
        this.categoryIndexSeasonal = category_index_seasonal;
    }

    public String getTasteIndexChocolover() {
        return tasteIndexChocolover;
    }

    public void setTasteIndexChocolover(String taste_index_chocolover) {
        this.tasteIndexChocolover = taste_index_chocolover;
    }

    public String getTasteIndexCreamlover() {
        return tasteIndexCreamlover;
    }

    public void setTasteIndexCreamlover(String taste_index_creamlover) {
        this.tasteIndexCreamlover = taste_index_creamlover;
    }

    public String getTasteIndexFillinglover() {
        return tasteIndexFillinglover;
    }

    public void setTasteIndexFillinglover(String taste_index_fillinglover) {
        this.tasteIndexFillinglover = taste_index_fillinglover;
    }

    public String getTasteIndexFruitlover() {
        return tasteIndexFruitlover;
    }

    public void setTasteIndexFruitlover(String taste_index_fruitlover) {
        this.tasteIndexFruitlover = taste_index_fruitlover;
    }

    public String getTasteIndexPlainlover() {
        return tasteIndexPlainlover;
    }

    public void setTasteIndexPlainlover(String taste_index_plainlover) {
        this.tasteIndexPlainlover = taste_index_plainlover;
    }

    public String getTasteIndexSavourylover() {
        return tasteIndexSavourylover;
    }

    public void setTasteIndexSavourylover(String taste_index_savourylover) {
        this.tasteIndexSavourylover = taste_index_savourylover;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String last_update_date) {
        this.lastUpdateDate = last_update_date;
    }

    public String getOptinDate() {
        return optinDate;
    }

    public void setOptinDate(String optin_date) {
        this.optinDate = optin_date;
    }

    public String getPrivacyStore() {
        return privacyStore;
    }

    public void setPrivacyStore(String privacy_store) {
        this.privacyStore = privacy_store;
    }

    public String getRegistationDate() {
        return registationDate;
    }

    public void setRegistationDate(String registation_date) {
        this.registationDate = registation_date;
    }

    public String getValassisUid() {
        return valassisUid;
    }

    public void setValassisUid(String valassis_uid) {
        this.valassisUid = valassis_uid;
    }



}
