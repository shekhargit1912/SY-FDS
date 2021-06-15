

import java.io.*;

class Covid_Patient {
    Covid_Patient(String name) {
        System.out.println("Constructor with one " + "argument - String : " + name);
    }

    Covid_Patient(String name, int id, String DOB, String Bloodgroup, String Test_Report, String address, int telephone,
            long Aadhar) {

        System.out.println("Pationts details :=" + "|| Name " + name + "|| ID:-" + id + "|| DOB:-" + DOB
                + " || Blood group:-" + Bloodgroup + " || Test_report:-" + address + " || Telephone:-" + telephone);

    }

    Covid_Patient(long id1) {
        System.out.println("one parameter " + "Long : " + id1);
    }
}

class xyz {
    public static void main(String[] args) {

        Covid_Patient Covid_Patient1 = new Covid_Patient("Shlok");
        Covid_Patient Covid_Patient2 = new Covid_Patient("Raghav", 202, "20-5-2001", "+Ove", "well", "Pune", 90967766,
                536871066);

        Covid_Patient Covid_Patient3 = new Covid_Patient(325614567);
    }
}

