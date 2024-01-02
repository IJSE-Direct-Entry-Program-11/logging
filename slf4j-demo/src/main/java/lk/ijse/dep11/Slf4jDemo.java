package lk.ijse.dep11;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jDemo {

    //private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jDemo.class);

    public static void main(String[] args) throws InterruptedException {
        log.trace("This is a trace log");
        log.debug("This is a debug log");
        log.info("This is an information log");
        log.warn("This is a warning log");
        log.error("This is an error log");

        String id = "C001";
        String name = "Kasun";
        String address = "Galle";

        System.out.println("Id=" + id + ", Name=" + name + ", Address=" + address);
        log.debug("Id={}, Name={}, Address={}", id, name, address);

        try {
            int value = 5 / 0;
        }catch (Exception e){
            // e.printStackTrace(); Bye bye!
            log.error("Invalid Calculation", e);
        }

        Thread t1 = new Thread(()->{
            while(true){
                try {
                    Thread.sleep(5000);
                    log.info("New Log");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();

        // while (t1.isAlive());
        t1.join();
    }
}
