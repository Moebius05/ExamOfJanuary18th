package lecture.week9.robodog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class performanceReader {

    public  List<performance> getPerformance(String filePath) {
        return new FileReader().asStream("lecture/week9/robodog/students-performance.csv")
                .skip(1)
                .map(e -> Arrays.asList(e.split(";")))
                .map(e -> new performance
                        (e.get(0),
                                e.get(1),
                                Integer.valueOf(e.get(2)),
                                Integer.valueOf(e.get(3)),
                                Integer.valueOf(e.get(4))))
                .collect(Collectors.toList());
    }
}