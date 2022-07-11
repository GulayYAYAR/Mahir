package WEEK1;

public class Session3 {
    public static void main(String[] args) {

     //logical opearators
        //&& and
        //|| or
        //! not


//Relational Operators
        //== equal
        //!= not equal
        //> bigger
        //< smaller
        //>= bigger and equal
        //<= smaller and equal


boolean b1=5==3;
        System.out.println("b1="+b1);
        boolean b2=10!=5;
        System.out.println("b2="+b2);


//iF
        /**
         * if(condition){
         * the block of the code to be executed if condition is true
         * }
         */

    String weather="Cold";
    if(weather=="Sunny"){
        System.out.println("i will meet with you.");
        System.out.println("we can eat");
        System.out.println("we can go to the cinema");}
        System.out.println("previous messages are not printed");



            int age=24;
            boolean hasMoney=true;

        System.out.println("welcome to the liquor store");
        if (age>=21 && hasMoney){
            System.out.println("Enjoy your wine!");}
        System.out.println("CASE 2");
        age=20;
        hasMoney=false;
        if (age>=21 && hasMoney){
            System.out.println("Enjoy your wine!");}


//IF ELSE

        System.out.println("CASE 3");

        int age2=21;
        if (age2>22){
            System.out.println("Enjoy your drink");

        }else{
            System.out.println("you are not eligible to buy drink");
        }

        //Calculator


        double bill=190;

        double tip1=bill*0.15;
        double tip2=bill*0.20;

        double totalAmount=bill+tip1;
        double totalAmount2=bill+tip2;

        if (bill>=99 && bill<280){
            System.out.println("The bill was $" +bill+", the tip was $"+tip1+ ", and the total value is $" +totalAmount);}
        else if(bill<0){
            System.out.println("invalid data");}
        else {System.out.println("The bill was $" +bill+", the tip was $"+tip2+", and the total value is $" +totalAmount2);}

//IKINCI BIR BAKIS


                double Bill =0.00; //

                double tipRate=0;
                double tip=0;
                double finalBill=0;

                // if the bill value is between 99 and 280.
                if (bill >=99 && bill<280){
                    // case bill =100 >> 100 >=99 && 100 <280
                    //  true && true >> true

                    //case bill =20: 20>=99 && 20<280
                    //               false && true  >> false

                    // it's usual to tip 15%
                    tipRate=0.15; // %15 .

                    tip= bill * tipRate; // tip = %15 of the bill

                    finalBill= bill + tip;

                    System.out.println("bill = " + Bill);
                    System.out.println("tipRate = " + tipRate);
                    System.out.println("tip = " + tip);
                    System.out.println("finalBill = " + finalBill);


                }else {//// Condition2 >>> If the value is different, the tip is 20%.
                    //the tip is 20%.
                    tipRate=0.20;

                    tip =Bill * tipRate; // 20 * 0.20 ==4

                    finalBill= Bill +tip; // 20 +4

                    System.out.println("bill = " + Bill);
                    System.out.println("tipRate = " + tipRate);
                    System.out.println("tip = " + tip);
                    System.out.println("finalBill = " + finalBill);

                }


            }
        }


