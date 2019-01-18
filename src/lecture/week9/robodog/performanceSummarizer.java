package lecture.week9.robodog;

import java.util.*;

import java.util.stream.Collectors;

public class performanceSummarizer {

    private List<performance> performances = readPerformances();

    private List<performance> readPerformances() {
        return new performanceReader().getPerformance("students-performance.csv");
    }

    public long getTotalNumberOfStudents() {
        return performances.stream()
                .sorted(Comparator.comparing(performance::getMath_score).reversed())
                .limit(10)
                .count();
    }

    public long getNumberOfStudentsWithMoreThan90InAllFields() {
        return performances.stream()
                .filter(e -> e.getReading_score() > 90)
                .filter(e -> e.getMath_score() > 90)
                .filter(e -> e.getWriting_score() > 90)
                .sorted(Comparator.comparing(performance::getReading_score).reversed())
                .count();
    }

    public List<performance> totalNumberOfStudentsWith100InAllFields() {
        return performances.stream()
                .filter(e -> e.getReading_score() == 100)
                .filter(e -> e.getMath_score() == 100)
                .filter(e -> e.getWriting_score() == 100)
                .collect(Collectors.toList());
    }

    public long totalNumberOfGirlsWith100InEverything() {
        return performances.stream()
                .filter(e -> e.getReading_score() == 100)
                .filter(e -> e.getMath_score() == 100)
                .filter(e -> e.getWriting_score() == 100)
                .filter(e -> e.gender == "female")
                .count();
    }

    public long totalNumberOfBoysWith100InEverything() {
        return performances.stream()
                .filter(e -> e.getReading_score() == 100)
                .filter(e -> e.getMath_score() == 100)
                .filter(e -> e.getWriting_score() == 100)
                .filter(e -> e.gender == "male")
                .count();
    }

    public int betterThan50atReading() {
        List<String> educationalLevels = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        performances.stream()
                .map(e -> {
                    if (educationalLevels.contains(e.parental_level_of_education) != false) {
                        educationalLevels.add(e.parental_level_of_education);}
                return e;
                }).collect(Collectors.toList());
        return educationalLevels.size();
    }


}
