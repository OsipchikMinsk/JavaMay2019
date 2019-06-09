package cheefcook.service;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerService {
    private static final Logger log = Logger.getLogger(LoggerService.class);
    private static LoggerService instance;
    private LoggerService (){

        }
    public static LoggerService getInstance (){
        if (instance!=null){
            instance = new LoggerService();
        }
        return instance;
    }

    public static Logger getLog() {
        PropertyConfigurator.configure("C:\\Users\\ARTos\\IdeaProjects" +
                "\\IntroductionToJava\\src\\cheefcook\\resources\\log4j.properties");
        return log;
    }
}
