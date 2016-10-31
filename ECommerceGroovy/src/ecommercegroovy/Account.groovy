/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommercegroovy

import java.util.Date;
/**
 *
 * @author Bimo
 */
class Account {
	def ID;
        def username;
        def password;
        def nama;
        def email;
        def joinDate;
        def noHp;
        def alamat;
        
        public void edit(String field, String newvalue){
            switch(field.toUpperCase()){
                case "NOHP" : 
                    setNoHP(newvalue);
                    break;
                case "PASSWORD" : 
                    setpassword(newvalue);
                    break;
                 
            }
        }
        
        public Account(){ }
        public Account(int ID, String username, String password, String nama, String email, Date joinDate, String noHp, String alamat){
            this.ID = ID;
            this.username = username;
            this.password = password;
            this.nama = nama;
            this.email = email;
            this.joinDate = joinDate;
            this.noHp = noHp;
            this.alamat = alamat;
        }
      public def getID(){
          return this.ID;
      }
      public def getusername(){
          return this.username;
      }
      public def getpassword(){
          return this.password;
      }
      public setpassword(String newpassword){
          this.password = newpassword;
      }
      public def getnama(){
          return this.nama;
      }
      public def getemail(){
          return this.email;
      }
      public def getjoinDate(){
          return this.joinDate;
      }
      public def getNoHP(){
          return this.noHp;
      }
      public setNoHP(String newNoHP){
          this.noHP = newNoHP;
      }
      public def getalamat(){
          return this.alamat;
      }
      public setalamat(String newalamat){
          this.alamat = newalamat;
      }
}

