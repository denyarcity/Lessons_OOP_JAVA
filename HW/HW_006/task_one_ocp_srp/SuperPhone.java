package HW.HW_006.task_one_ocp_srp;

public class SuperPhone extends TelephoneAbstract {

    @Override
    public void mode() {
        System.out.println("Без блокировки");
    }

    @Override
    public void pin() {
        System.out.println("Пинкод");
    }

    @Override
    public void fingerprint() {
        System.out.println("Отпечаток пальца");
    }

    @Override
    public void faceID() {
        System.out.println("распознавание по лицу");
    }
}