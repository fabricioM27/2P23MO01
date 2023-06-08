package com.example.a2p23mo01.Configuracion;

public class Transacciones
{
    //Nombre de la base de datos
    public static final String NameDatabase = "PM01DB";

    //Tablas de la base de datos
    public static final String tablaPersonas = "personas";
     // Campos de la tabla personas
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String edad = "edad";
    public static final String correo = "correo";

    // DDL Create and Drop
    public static final String CreateTablePersona = "CREATE TABLE PERSONAS "+
            "(id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT, apellidos TEXT, edad INTEGER, "+
            "correo TEXT )";

    public static final String DROPTablePersonas = "DROP TABLE IF EXISTS personas";

    //DML

    public static final String SelecTablePersona = "SELECT * FROM " + Transacciones.tablaPersonas;
}
