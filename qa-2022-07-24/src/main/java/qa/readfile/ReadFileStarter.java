package qa.readfile;

import qa.readfile.csv.FileReader;
import qa.readfile.info.YearlyInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileStarter {

    public static void main(String[] args) {
        String fileStr = FileReader.readFileContentsOrNull("qa-2022-07-24/src/main/resources/y.2021.csv");
        System.out.println(fileStr);

        List<YearlyInfo> infos = new ArrayList<>();

        if (fileStr != null) {
            String[] split = fileStr.split(System.lineSeparator());
            System.out.println(Arrays.toString(split));

            for (int i = 1; i < split.length; i++) {
                String[] split1 = split[i].split(",");
                YearlyInfo yearlyInfo = new YearlyInfo(
                        Integer.parseInt(split1[0]), Integer.parseInt(split1[1]), Boolean.parseBoolean(split1[0]));
                infos.add(yearlyInfo);
            }
        }

        System.out.println(infos);
    }
}
