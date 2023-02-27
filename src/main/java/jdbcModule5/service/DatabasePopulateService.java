package jdbcModule5.service;

import jdbcModule5.database.DataBase;
import jdbcModule5.utils.ExecuteService;
import jdbcModule5.utils.Prefs;

public class DatabasePopulateService {
    DataBase dataBase;

    public static void main(String[] args) {
        ExecuteService.executeSqlFile(Prefs.POPULATE_INSERT_DB_FILENAME);
    }
}
