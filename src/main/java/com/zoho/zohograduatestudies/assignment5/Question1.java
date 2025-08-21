package com.zoho.zohograduatestudies.assignment5;

class MedicalRecord
{
       long recordId;
       String patientName;
       String dateOfVisit;
       String diagnosis;

       public MedicalRecord(){}

      public MedicalRecord(long id,String name,String dateOfVisit,String test)
     {

               this.recordId=id;
               this.patientName=name;
               this.dateOfVisit=dateOfVisit;
               this.diagnosis=test;
     }

     public void  setRecordDetails(long id,String name,String date,String disease )
     {
              recordId=id;
              patientName=name;
              dateOfVisit=date;
              diagnosis=disease;
     }

     public void  displayRecord()
     {

          System.out.println("==== Medical records ====");
          System.out.println("record id : "+recordId);
          System.out.println("patient name : "+patientName);
          System.out.println("date of visit : "+dateOfVisit);
          System.out.println("diagnosis : "+diagnosis);
          System.out.println("____________________________________");
     }
}

class InPatientRecord extends MedicalRecord
{
         private int roomNumber;
         private int numberOfDaysAdmitted;
         private double roomChargePerDay;

         public InPatientRecord(){}

           public InPatientRecord(long id, String name, String dateofvisit, String diagnosis, int roomnumber, int numberofdaysadmitted, double roomcharges)
           {
               super(id, name, dateofvisit, diagnosis);
               this.numberOfDaysAdmitted = numberofdaysadmitted;
               this.roomChargePerDay = roomcharges;
               this.roomNumber = roomnumber;

           }


    public void calculateTotalCharges()
    {

        double perDay = roomChargePerDay;
        int noOfDays = numberOfDaysAdmitted;
        double totalCharges = perDay * noOfDays;
        System.out.println("the total inpatient cost is :" + totalCharges);
        System.out.println("______________________________________________");

    }

    public void displayRecord()
    {
        System.out.println("==== In patients records ==== ");
        System.out.println("record id : " + recordId);
        System.out.println("patient name : " + patientName);
        System.out.println("date of visit : " + dateOfVisit);
        System.out.println("diagnosis : " + diagnosis);
        System.out.println("room number : " + roomNumber);
        System.out.println("Number of days admitted : " + numberOfDaysAdmitted);
        System.out.println("room charge per day :" + roomChargePerDay);


    }
}
    class OutPatientRecord extends MedicalRecord
    {
        private String doctorName;
        private double consultationFee;

        public OutPatientRecord(long id,String name,String date,String problem,String doctorname,double fee)
        {
            super(id,name,date,problem);
            this.doctorName=doctorname;
            this.consultationFee=fee;
        }

        public void displayRecord()
        {

            System.out.println("==== out patient details ====");
            System.out.println("record id : "+recordId);
            System.out.println("patient name : "+patientName);
            System.out.println("date of visit : "+dateOfVisit);
            System.out.println("diagnosis : "+diagnosis);
            System.out.println("doctor name : "+doctorName);
            System.out.println("consultation fees : "+consultationFee);
        }

    }




public class Question1
{
     public static void main(String args[])
     {
             MedicalRecord base=new MedicalRecord();
             base.setRecordDetails(25122022,"john","25/12/2022","cancer");
             base.displayRecord();

            InPatientRecord no=new InPatientRecord();
            InPatientRecord record = new InPatientRecord(25122022,"eren","25/12/2022","viral fever",2302,5,1000);
            record.displayRecord();
            record.calculateTotalCharges();

            OutPatientRecord obj=new OutPatientRecord(01012023
                    ,"jack","01/01/2023","joundice","aravind",500);
            obj.displayRecord();

     }
}


