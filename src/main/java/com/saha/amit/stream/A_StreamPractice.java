package com.saha.amit.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * Stream Practice Workbook
 * Author: Amit Saha
 * <p>
 * 25 Problems to master Java Stream API
 * -------------------------------------
 * Each method demonstrates one concept:
 * - filter, map, collect
 * - reduce, grouping, partitioning
 * - flatMap, sorting, distinct, etc.
 */

public class A_StreamPractice {

    private final static Logger log = LoggerFactory.getLogger(A_StreamPractice.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("\n========= Stream Practice Menu =========");
        while (true) {
            log.info("1. Filter and Map Example");
            log.info("2. Square Numbers");
            log.info("3. Names Starting with A");
            log.info("4. Convert to Uppercase");
            log.info("5. Count Numbers Greater Than 10");
            log.info("6. Remove Duplicates and Sort");
            log.info("7. Top 3 Highest Numbers");
            log.info("8. Skip and Sum");
            log.info("9. Find Max with Reduce");
            log.info("10. Product of Elements");
            log.info("11. Get Employee Names");
            log.info("12. Find Employees in Department");
            log.info("13. Find Employee with Highest Salary");
            log.info("14. Average Salary in Department");
            log.info("15. Group Employees by Department");
            log.info("16. Total Salary per Department");
            log.info("17. Word Frequency Counter");
            log.info("18. Flatten Nested List");
            log.info("19. Unique Characters from Words");
            log.info("20. Partition Even and Odd Numbers");
            log.info("21. Find Second Highest Salary");
            log.info("22. Common Elements Between Lists");
            log.info("23. Fibonacci Using Stream");
            log.info("24. Palindrome Words");
            log.info("25. Sort Map by Value Descending");
            log.info("0. Exit");
            log.info("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> basicFilterAndMap();
                case 2 -> squareNumbers();
                case 3 -> namesStartingWithA();
                case 4 -> convertToUppercase();
                case 5 -> countNumbersGreaterThan10();
                case 6 -> removeDuplicatesAndSort();
                case 7 -> topThreeHighest();
                case 8 -> skipAndSum();
                case 9 -> findMaxWithReduce();
                case 10 -> productOfElements();
                case 11 -> getEmployeeNames();
                case 12 -> findEmployeesInDept();
                case 13 -> findEmployeeWithHighestSalary();
                case 14 -> averageSalaryInDept();
                case 15 -> groupByDepartment();
                case 16 -> totalSalaryPerDept();
                case 17 -> wordFrequency();
                case 18 -> flattenList();
                case 19 -> uniqueCharactersFromWords();
                case 20 -> partitionEvenOdd();
                case 21 -> secondHighestSalary();
                case 22 -> commonElementsBetweenLists();
                case 23 -> fibonacciStream();
                case 24 -> palindromeWords();
                case 25 -> sortMapByValueDescending();
                case 0 -> {
                    log.info("Goodbye 👋");
                    return;
                }
                default -> log.info("Invalid choice! Try again.");
            }
        }
    }

    // 1️⃣ Filter + Collect
    public static void basicFilterAndMap() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        log.info("Even numbers: {}", evens);
    }

    // 2️⃣ Map
    public static void squareNumbers() {
        List<Integer> numbers = List.of(2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        log.info("Squares: {}", squares);
    }

    // 3️⃣ Filter with Strings
    public static void namesStartingWithA() {
        List<String> names = List.of("Amit", "Rahul", "Ankit", "Ravi");
        List<String> result = names.stream()
                .filter(n -> n.startsWith("A"))
                .toList();
        log.info("Names starting with A: {}", result);
    }

    // 4️⃣ Map with method reference
    public static void convertToUppercase() {
        List<String> names = List.of("amit", "rahul", "ankit");
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();
        log.info("Uppercase: {}", upper);
    }

    // 5️⃣ Count
    public static void countNumbersGreaterThan10() {
        List<Integer> numbers = List.of(5, 10, 15, 20, 25);
        long count = numbers.stream()
                .filter(n -> n > 10)
                .count();
        log.info("Numbers > 10: {}", count);
    }

    // 6️⃣ Distinct + Sorted
    public static void removeDuplicatesAndSort() {
        List<Integer> numbers = List.of(3, 5, 3, 9, 1, 9);
        List<Integer> sorted = numbers.stream()
                .distinct()
                .sorted()
                .toList();
        log.info("Distinct + Sorted: {}", sorted);
    }

    // 7️⃣ Limit
    public static void topThreeHighest() {
        List<Integer> numbers = List.of(10, 40, 20, 70, 30);
        List<Integer> top3 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        log.info("Top 3 numbers: {}", top3);
    }

    // 8️⃣ Skip
    public static void skipAndSum() {
        int sum = IntStream.rangeClosed(1, 10)
                .skip(5)
                .sum();
        log.info("Sum after skipping first 5: {}", sum);
    }

    // 9️⃣ Reduce (max)
    public static void findMaxWithReduce() {
        List<Integer> numbers = List.of(3, 10, 5, 7, 15, 2);
        int max = numbers.stream()
                .reduce(Integer::max)
                .orElse(-1);
        log.info("Max value: {}", max);
    }

    // 🔟 Reduce (product)
    public static void productOfElements() {
        List<Integer> numbers = List.of(2, 3, 4);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        log.info("Product: {}", product);
    }

    // Create a few Employee records for later use
    static List<Employee> employees = List.of(
            new Employee("Amit", "IT", 80000),
            new Employee("Rahul", "HR", 60000),
            new Employee("Sneha", "IT", 90000),
            new Employee("Priya", "Finance", 75000),
            new Employee("Ravi", "HR", 65000)
    );

    record Employee(String name, String dept, double salary) {
    }

    // 11️⃣ Map from objects
    public static void getEmployeeNames() {
        List<String> names = employees.stream()
                .map(Employee::name)
                .toList();
        log.info("Employee names: {}", names);
    }

    // 12️⃣ Filter by field
    public static void findEmployeesInDept() {
        List<Employee> itEmployees = employees.stream()
                .filter(e -> e.dept().equals("IT"))
                .toList();
        log.info("IT Employees: {}", itEmployees);
    }

    // 13️⃣ Max comparator
    public static void findEmployeeWithHighestSalary() {
        Employee max = employees.stream()
                .max(Comparator.comparing(Employee::salary))
                .orElse(null);
        log.info("Highest Salary: {}", max);
    }

    // 14️⃣ Average
    public static void averageSalaryInDept() {
        double avg = employees.stream()
                .filter(e -> e.dept().equals("HR"))
                .mapToDouble(Employee::salary)
                .average()
                .orElse(0);
        log.info("Average HR Salary: {}", avg);
    }

    // 15️⃣ Grouping
    public static void groupByDepartment() {
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept));
        log.info("Grouped by dept: {}", grouped);
    }

    // 16️⃣ Summing by group
    public static void totalSalaryPerDept() {
        Map<String, Double> totals = employees.stream()
                .collect(Collectors.groupingBy(Employee::dept,
                        Collectors.summingDouble(Employee::salary)));
        log.info("Total salary per dept: {}", totals);
    }

    // 17️⃣ Word frequency
    public static void wordFrequency() {
        String text = "Java Stream API makes Java powerful and fun";
        Map<String, Long> freq = Arrays.stream(text.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        log.info("Word frequency: {}", freq);
    }

    // 18️⃣ FlatMap
    public static void flattenList() {
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2), List.of(3, 4), List.of(5, 6)
        );
        List<Integer> flat = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        log.info("Flattened list: {}", flat);
    }

    // 19️⃣ Unique characters
    public static void uniqueCharactersFromWords() {
        List<String> words = List.of("java", "stream", "rocks");
        List<Character> chars = words.stream()
                .flatMap(w -> w.chars().mapToObj(c -> (char) c))
                .distinct()
                .toList();
        log.info("Unique characters: {}", chars);
    }

    // 20️⃣ Partitioning
    public static void partitionEvenOdd() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        log.info("Partitioned: {}", partitioned);
    }

    // 21️⃣ Second-highest salary
    public static void secondHighestSalary() {
        Optional<Double> second = employees.stream()
                .map(Employee::salary)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        log.info("Second highest salary: {}", second.orElse(0.0));
    }

    // 22️⃣ Common elements
    public static void commonElementsBetweenLists() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7);
        List<Integer> common = list1.stream()
                .filter(list2::contains)
                .toList();
        log.info("Common elements: {}", common);
    }

    // 23️⃣ Fibonacci with streams
    public static void fibonacciStream() {
        List<Long> fib = Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .toList();
        log.info("Fibonacci series: {}", fib);
    }

    // 24️⃣ Palindrome words
    public static void palindromeWords() {
        String text = "madam level radar hello world";
        List<String> palindromes = Arrays.stream(text.split(" "))
                .filter(s -> new StringBuilder(s).reverse().toString().equalsIgnoreCase(s))
                .toList();
        log.info("Palindromes: {}", palindromes);
    }

    // 25️⃣ Sort map by value descending
    public static void sortMapByValueDescending() {
        Map<String, Integer> map = Map.of("A", 3, "B", 1, "C", 5);
        LinkedHashMap<String, Integer> sorted =
                map.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));
        log.info("Sorted by value: {}", sorted);
    }
}
