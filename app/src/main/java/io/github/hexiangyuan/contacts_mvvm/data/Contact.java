package io.github.hexiangyuan.contacts_mvvm.data;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-23
 */

public class Contact extends ResultsBean {


    /**
     * gender : female
     * name : {"title":"miss","first":"clarisse","last":"fernandes"}
     * location : {"street":"9459 avenida d. pedro ii","city":"belém","state":"rio de janeiro","postcode":26090}
     * email : clarisse.fernandes@example.com
     * login : {"username":"purplebear793","password":"626262","salt":"05DOYY2O","md5":"81d6721fbc54e1161173df5bccfbdd13","sha1":"e7b8251c2ac154dc314527dcc1eee7b9379ec5e4","sha256":"a11738aced9fe5b0ba5d275a1bc5a7d17ec3cd6cf95732f2b730c865db520797"}
     * dob : 1985-01-29 17:10:02
     * registered : 2008-03-16 14:33:10
     * phone : (75) 4108-6910
     * cell : (00) 3367-4375
     * id : {"name":"","value":null}
     * picture : {"large":"https://randomuser.me/api/portraits/women/62.jpg","medium":"https://randomuser.me/api/portraits/med/women/62.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/62.jpg"}
     * nat : BR
     */

    public String gender;
    public NameBean name;
    public LocationBean location;
    public String email;
    public String phone;
    public String cell;
    public PictureBean picture;

    public static class NameBean {
        public String title;
        public String first;
        public String last;
    }

    public static class LocationBean {
        public String street;
        public String city;
        public String state;
        public int postcode;
    }

    public static class PictureBean {
        public String large;
        public String medium;
        public String thumbnail;
    }
}
