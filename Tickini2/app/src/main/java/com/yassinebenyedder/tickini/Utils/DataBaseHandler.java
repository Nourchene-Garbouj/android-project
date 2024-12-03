package com.yassinebenyedder.tickini.Utils;

import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHandler extends SQLiteOpenHelper {
    private static int VERSION=1;
    private static final String Name ="toDoListDatabase";
    private static final String TODO_TABLE="todo";
    private static final String ID="id";
    private static final String TASK="task";
    private static final String STATUS="status";
    private static final String CREATE_TODO_TABLE="CREATE TABLE"+TODO_TABLE+"("+ ID +"INTEGER PRIMARY KEY AUTOINCREMENT, "
    +TASK+"TEXT, "+STATUS+" INTEGER)";
}
