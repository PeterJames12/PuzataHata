import military.BlackKursant;
import military.Contract;
import military.FrancuzKursant;
import military.IgorKursant;
import military2.ContractService;
import military2.Franchuz;
import military2.Igor;
import translate.Portugal;
import translate.Translate;
import translate.USA;
import translate.Ukraine;

/**
 * @author Igor Hnes on 10/20/17.
 */
public class Service {

    public static void main(String[] args) {
//
//        Contract contractIgor = new IgorKursant();
//        contractIgor.serveFifeYears();
//        contractIgor.running();
//
//        Contract contractFrancuz = new FrancuzKursant();
//        contractFrancuz.serveFifeYears();
//        contractFrancuz.running();
//
//        Contract contractBlack = new BlackKursant();
//        contractBlack.serveFifeYears();
//        contractBlack.running();
//
//
//        ContractService contractServiceIgor = new Franchuz();
//        contractServiceIgor.serveFiveYears();
//        contractServiceIgor.running();
//
//        ContractService contractServiceFranchuz = new Igor();
//        contractServiceFranchuz.serveFiveYears();
//        contractServiceFranchuz.running();

        final User alex = new User();
        final User bob = new User();

        User.name = "Alex";
        alex.age = 12;

        User.name = "Bob";
        bob.age = 24;

        System.out.println(User.name);
        System.out.println(alex.age);

        System.out.println(User.name);
        System.out.println(bob.age);
    }
}
