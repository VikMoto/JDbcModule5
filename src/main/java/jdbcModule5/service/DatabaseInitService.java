package jdbcModule5.service;

import jdbcModule5.database.DataBase;
import jdbcModule5.utils.ExecuteService;
import jdbcModule5.utils.Prefs;

public class DatabaseInitService {
    public static DataBase Database;


    public static void main(String[] args) {
        ExecuteService.executeSqlFile(Prefs.INIT_DB_FILENAME);
    }

}
