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
public class Dec2Bin {
    
    private long startval;
    private String resultval;
    private ArrayList<String> steps;
    private String errmsg;
    
    public Dec2Bin(String val){
        errmsg = "";
        try {
            //validate String val ...
            long v = Long.parseLong(val);
            if (v < 0){
                errmsg = "Value cannot be negative. ";
            } else {
                startval = v;
                resultval = " ";
                steps = new ArrayList();//steps = new ArrayList<>();
                convertByRecursion(v);
            }
        } catch (NumberFormatException e){
            errmsg = "Illegal value: not an integer. ";
        }
    } public String getErrorMsg(){
            return errmsg;
        }
private void convertByRecursion(long v){
    int r;
    long newval;
    String stp;
    
    r = (int)(v % 2);
    newval = v/2;
    stp = v + " divided by 2 = " + newval + " with  a reminder of: " + r;
    
    steps.add(stp);
    if (newval > 0){
        convertByRecursion(newval);
    }
    resultval += String.valueOf(r);    
}
public String getResult() {
    return resultval;
}
public ArrayList<String> getSteps(){
    return steps;
   
}
public long getStartValue(){
    return startval;
}
}
