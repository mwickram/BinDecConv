/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Praminda Imaduwa-Gamage
 */
public class Bin2Dec {
    private String startval, resultval, errmsg;
    private ArrayList<String> steps;
    
    public Bin2Dec (String startval){
        this.startval = startval;
        this.errmsg = "";
        if (isValid()){
            convert();
            
        }else {
            this.errmsg = "value is not a valid binary number";
        }
        
    }

    //Program in the class
   /* private boolean isValid() {


        for(int i=0; i < this.startval.length(); i++){
            if (this.startval.charAt(i) != '0' &&
                this.startval.charAt(i) !='1'){
                return false;
            }
        }//end of for
        return true;
    }//end of isValid
    *
    */

    // Extra Credit
    private boolean isValid(){

       boolean validation=false;

       do {
               try {
                   int BinrayNum = Integer.parseInt(this.startval,2);
                   return true;

               }catch (Exception e){
                   return false;
               }
       }while (validation=true);    
    }//end of isValid

//Extra credit

    private void convert() {

        long res = 0;
        this.steps = new ArrayList();//steps = new ArrayList<>();

        String reverse = new StringBuffer(this.startval).reverse().toString();
        
        for(int i= 0;i<reverse.length(); i++) {

            if (reverse.charAt(i)=='1'){

             long decimalVal = (long)Math.pow(2,i);
             res += decimalVal;
             String s = "There is a(n) " + decimalVal +
                    " in the number (2^ " + i + " )";
             this.steps.add(s);
            }
    }
        this.resultval = String.valueOf(res);
    }//ennd of covert


    //Program in the class
  /*private void convert() {
               
        //     8421
        // ex: 1101 = 1 + 8 + 4 (from right)
        
        long res = 0;
        int pos = 0;
        this.steps = new ArrayList();//steps = new ArrayList<>();


        
        for(int i = this.startval.length()-1; i>=0; i--) {

         if (this.startval.charAt(i) == '1'){
             res += (long) Math.pow(2,pos);
             String s = "There is a(n) " + 
                     (long) Math.pow(2, pos) + 
                     " in the number (2^ " + pos + ")";
             this.steps.add(s);
         }
         pos++;
    }
        this.resultval = String.valueOf(res);
    }
   *
   */
  

    public String getStartValue(){
        return this.startval;
    }
    public String getResult(){
        return this.resultval;
}
    public String getErrorMsg(){
        return this.errmsg;
    }
    public ArrayList<String> getSteps(){
        return this.steps;
    }
}//end of class
