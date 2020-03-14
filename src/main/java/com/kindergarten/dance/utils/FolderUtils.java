package com.kindergarten.dance.utils;

import com.kindergarten.dance.model.Settings;
import com.kindergarten.dance.services.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FolderUtils {

    @Autowired
    SettingsService settingsService;

    public FolderUtils() {
        List<Settings> settingsList = settingsService.getAll();
        if (settingsList != null && !settingsList.isEmpty()) {
            List<Path> pathList = new ArrayList<>();
            settingsList.forEach(n -> pathList.add(Paths.get(n.getVal())));
            fixListOfFolderPath(pathList);
        }
    }

    public static boolean fixListOfFolderPath(List<Path> pathList) {
        if (pathList != null && !pathList.isEmpty()) {
            pathList.stream().forEach(n -> fixFolderPath(n));
            return true;
        }
        return false;
    }

    public void fixFolderPath(String path) {
        String directoryName = path.concat(this.getClass().getName());
        File directoryFile = new File(directoryName);
        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }
    }

    public static boolean fixFolderPath(Path path) {
//        System.out.println("fixFolderPath " + path.toString());
        try {
            File folderFix = new File(path.toString());
            if (!folderFix.exists()) {
                folderFix.mkdirs();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
