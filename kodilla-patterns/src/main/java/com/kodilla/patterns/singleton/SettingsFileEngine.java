package com.kodilla.patterns.singleton;


public final class SettingsFileEngine {
    //1. ukryta instancja NULL
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    //2. wkładamy prywatny konstruktor
    private SettingsFileEngine() {
    }

    //3.statyczna metoda getInstance, która tworzy tylko 1 instancję
    //nie tworzymy obiektu
    //blok synchronized
    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            //blok w którym umieszczam kod modyfikujący pola obiektu, który ma być chroniony.
            synchronized(SettingsFileEngine.class) {
                if (settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }
    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}