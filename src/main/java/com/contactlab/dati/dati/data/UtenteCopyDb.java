package com.contactlab.dati.dati.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "clienti_copy")
public class UtenteCopyDb {

        @Id
        @Column(name = "id")
        private int id;
        private int processed;
        private String uid;
        private String email;
        private String age;
        private Date dob;
        private String  city;
        private String   country;
        private String   firstname;
        private String   lastname;
        private String   gender;
        private String  zip;
        @Column(name = "cod_province")
        private String codProvince;
        private String dvDesktopCount;
        private String dvDesktopLast;
        @Column(name = "dv_mobile_count")
        private String dvMobileCount;
        @Column(name = "dv_mobile_last")
        private String dvMobileLast;
        @Column(name = "dv_tablet_count")
        private String dvTabletCount;
        @Column(name = "dv_tablet_last")
        private String dvTabletLast;
        @Column(name = "last_login_date")
        private String    lastlogindate;
        @Column(name = "mobile_phone")
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
        private String  preferred_retailer;
        private String  privacy_profiling;
        private String  privacy_recall;
        private String  registration_initiative;
        private String  telephone;
        private String  is_active;
        private String  is_registered;
        private String  is_verified;
        private String  login_provider;
        private String  social_providers;
        private String  status_user;
        private String  address;
        private String  category_index_biscuits;
        private String  category_index_minicakes;
        private String  category_index_savoury;
        private String  category_index_seasonal;
        private String  taste_index_chocolover;
        private String  taste_index_creamlover;
        private String  taste_index_fillinglover;
        private String  taste_index_fruitlover;
        private String  taste_index_plainlover;
        private String  taste_index_savourylover;
        private String  last_update_date;
        private String  optin_date;
        private String  privacy_store;
        private String  registation_date;
        private String  valassis_uid;


    public UtenteCopyDb() {
    }

    public UtenteCopyDb(int id, int processed, String uid, String email, String age, Date dob, String city,
                        String country, String firstname, String lastname, String gender, String zip,
                        String codprovince, String dvDesktopCount, String dv_desktop_last, String dv_mobilecount,
                        String dv_mobilelast, String dvTabletCount, String dvTabletlast, String lastlogindate,
                        String mobilephone, String prBauli, String prMotta, String prBuondi, String prGirella,
                        String prYoyo, String prCiocori, String prDoria, String prBistefani, String prAlemagna,
                        String prCasalini, String prBauligroup, String preferred_retailer, String privacy_profiling,
                        String privacy_recall, String registration_initiative, String telephone, String is_active,
                        String is_registered, String is_verified, String login_provider, String social_providers,
                        String status_user, String address, String category_index_biscuits, String category_index_minicakes,
                        String category_index_savoury, String category_index_seasonal, String taste_index_chocolover,
                        String taste_index_creamlover, String taste_index_fillinglover, String taste_index_fruitlover,
                        String taste_index_plainlover, String taste_index_savourylover, String last_update_date,
                        String optin_date, String privacy_store, String registation_date, String valassis_uid) {

            this.id = id;
            this.processed = processed;
            this.uid = uid;
            this.email = email;
            this.age = age;
            this.dob = dob;
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
            this.lastlogindate = lastlogindate;
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
            this.preferred_retailer = preferred_retailer;
            this.privacy_profiling = privacy_profiling;
            this.privacy_recall = privacy_recall;
            this.registration_initiative = registration_initiative;
            this.telephone = telephone;
            this.is_active = is_active;
            this.is_registered = is_registered;
            this.is_verified = is_verified;
            this.login_provider = login_provider;
            this.social_providers = social_providers;
            this.status_user = status_user;
            this.address = address;
            this.category_index_biscuits = category_index_biscuits;
            this.category_index_minicakes = category_index_minicakes;
            this.category_index_savoury = category_index_savoury;
            this.category_index_seasonal = category_index_seasonal;
            this.taste_index_chocolover = taste_index_chocolover;
            this.taste_index_creamlover = taste_index_creamlover;
            this.taste_index_fillinglover = taste_index_fillinglover;
            this.taste_index_fruitlover = taste_index_fruitlover;
            this.taste_index_plainlover = taste_index_plainlover;
            this.taste_index_savourylover = taste_index_savourylover;
            this.last_update_date = last_update_date;
            this.optin_date = optin_date;
            this.privacy_store = privacy_store;
            this.registation_date = registation_date;
            this.valassis_uid = valassis_uid;
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

        public int getId() {
            return id;
        }

        public void setId(int progressive_id) {
            this.id = progressive_id;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

        public String getLastlogindate() {
            return lastlogindate;
        }

        public void setLastlogindate(String lastlogindate) {
            this.lastlogindate = lastlogindate;
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

        public String getPreferred_retailer() {
            return preferred_retailer;
        }

        public void setPreferred_retailer(String preferred_retailer) {
            this.preferred_retailer = preferred_retailer;
        }

        public String getPrivacy_profiling() {
            return privacy_profiling;
        }

        public void setPrivacy_profiling(String privacy_profiling) {
            this.privacy_profiling = privacy_profiling;
        }

        public String getPrivacy_recall() {
            return privacy_recall;
        }

        public void setPrivacy_recall(String privacy_recall) {
            this.privacy_recall = privacy_recall;
        }

        public String getRegistration_initiative() {
            return registration_initiative;
        }

        public void setRegistration_initiative(String registration_initiative) {
            this.registration_initiative = registration_initiative;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getIs_active() {
            return is_active;
        }

        public void setIs_active(String is_active) {
            this.is_active = is_active;
        }

        public String getIs_registered() {
            return is_registered;
        }

        public void setIs_registered(String is_registered) {
            this.is_registered = is_registered;
        }

        public String getIs_verified() {
            return is_verified;
        }

        public void setIs_verified(String is_verified) {
            this.is_verified = is_verified;
        }

        public String getLogin_provider() {
            return login_provider;
        }

        public void setLogin_provider(String login_provider) {
            this.login_provider = login_provider;
        }

        public String getSocial_providers() {
            return social_providers;
        }

        public void setSocial_providers(String social_providers) {
            this.social_providers = social_providers;
        }

        public String getStatus_user() {
            return status_user;
        }

        public void setStatus_user(String status_user) {
            this.status_user = status_user;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCategory_index_biscuits() {
            return category_index_biscuits;
        }

        public void setCategory_index_biscuits(String category_index_biscuits) {
            this.category_index_biscuits = category_index_biscuits;
        }

        public String getCategory_index_minicakes() {
            return category_index_minicakes;
        }

        public void setCategory_index_minicakes(String category_index_minicakes) {
            this.category_index_minicakes = category_index_minicakes;
        }

        public String getCategory_index_savoury() {
            return category_index_savoury;
        }

        public void setCategory_index_savoury(String category_index_savoury) {
            this.category_index_savoury = category_index_savoury;
        }

        public String getCategory_index_seasonal() {
            return category_index_seasonal;
        }

        public void setCategory_index_seasonal(String category_index_seasonal) {
            this.category_index_seasonal = category_index_seasonal;
        }

        public String getTaste_index_chocolover() {
            return taste_index_chocolover;
        }

        public void setTaste_index_chocolover(String taste_index_chocolover) {
            this.taste_index_chocolover = taste_index_chocolover;
        }

        public String getTaste_index_creamlover() {
            return taste_index_creamlover;
        }

        public void setTaste_index_creamlover(String taste_index_creamlover) {
            this.taste_index_creamlover = taste_index_creamlover;
        }

        public String getTaste_index_fillinglover() {
            return taste_index_fillinglover;
        }

        public void setTaste_index_fillinglover(String taste_index_fillinglover) {
            this.taste_index_fillinglover = taste_index_fillinglover;
        }

        public String getTaste_index_fruitlover() {
            return taste_index_fruitlover;
        }

        public void setTaste_index_fruitlover(String taste_index_fruitlover) {
            this.taste_index_fruitlover = taste_index_fruitlover;
        }

        public String getTaste_index_plainlover() {
            return taste_index_plainlover;
        }

        public void setTaste_index_plainlover(String taste_index_plainlover) {
            this.taste_index_plainlover = taste_index_plainlover;
        }

        public String getTaste_index_savourylover() {
            return taste_index_savourylover;
        }

        public void setTaste_index_savourylover(String taste_index_savourylover) {
            this.taste_index_savourylover = taste_index_savourylover;
        }

        public String getLast_update_date() {
            return last_update_date;
        }

        public void setLast_update_date(String last_update_date) {
            this.last_update_date = last_update_date;
        }

        public String getOptin_date() {
            return optin_date;
        }

        public void setOptin_date(String optin_date) {
            this.optin_date = optin_date;
        }

        public String getPrivacy_store() {
            return privacy_store;
        }

        public void setPrivacy_store(String privacy_store) {
            this.privacy_store = privacy_store;
        }

        public String getRegistation_date() {
            return registation_date;
        }

        public void setRegistation_date(String registation_date) {
            this.registation_date = registation_date;
        }

        public String getValassis_uid() {
            return valassis_uid;
        }

        public void setValassis_uid(String valassis_uid) {
            this.valassis_uid = valassis_uid;
        }



    }

