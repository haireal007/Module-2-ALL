package controler;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import io.ReaderAndWriteAcc;
import model.Account;
import model.Machine;
import model.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerMachine {
    Scanner scanner = new Scanner(System.in);
    ReaderAndWriteAcc<Account> readerAndWriteAcc = new ReaderAndWriteAcc<>();
    ReaderAndWriteAcc<Service> service = new ReaderAndWriteAcc<>();
    ArrayList<Account> machines = new ArrayList<>();
    static public Machine machine;
    {
        machines = readerAndWriteAcc.reader("D:\\Module2\\caseStudy1\\src\\data\\Machine.csv");


    }


}
