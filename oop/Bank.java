import java.util.Scanner;
class Bank{
    int amount;
    float rate;
    float period;

Bank()
    {
        amount=500000;
        rate=0;
        period=0;
    }

    void getdetails()
    {
        Scanner s=new Scanner(System.in);

            System.out.println("Enter the period of loan:");
            period=s.nextInt();
    }
    void getinterest()
    {

        System.out.println("Interest paid is : "+(amount*period*rate)/100);
    }

}
class SBI extends Bank{
    double rate;

    void getinterest()
    {
                rate=8.4;
                this.getdetails();
                if (period>0)
                {
                System.out.println("Interest paid by Rahul on amt is : "+(amount*period*rate)/100);
    
                }
                else{
                    System.out.println("period shoulld be greater than 0!!!");
                }
                }
}
class HDFC extends Bank{
    double rate;
    void getinterest()
    {
                rate=7.3;
                this.getdetails();
                if (period>0)
                {
                System.out.println("Interest paid by Rahul on amt is : "+(amount*period*rate)/100);
    
                }
                else{
                    System.out.println("period shoulld be greater than 0!!!");
                } }
}
class ICICI extends Bank{
    double rate;
    void getinterest()
    {
                rate=9.7;
                this.getdetails();
               if (period>0)
                {
                System.out.println("Interest paid by Rahul on amt is : "+(amount*period*rate)/100);
    
                }
                else{
                    System.out.println("period shoulld be greater than 0!!!");
                }  }
}

public class Main{
            public static void main(String []args){
            int choice;
            Bank loan=new Bank();

            Scanner s=new Scanner(System.in);
                System.out.println("Loan amount:500000\n");
                System.out.println("Enter your Choice:\n1.SBI\n2.HDFC\n3.ICICI\n");
        choice=s.nextInt();
        switch(choice)
        {
        case 1:
            loan=new SBI();

            break;
        case 2:
            loan=new HDFC();

            break;
        case 3:
            loan=new ICICI();

            break;
        default:
System.out.println("Error!");
        }
loan.getinterest();

    }
}


