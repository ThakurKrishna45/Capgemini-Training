package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
//        List<String> immutableList = Stream.of("red", "green", null, null).toList();
//        System.out.println(immutableList);
//        System.out.println("-------------------------------------------------");
//        List<String> mutuableList = Stream.of("red", "green", null, null).collect(Collectors.toList());
//        System.out.println(mutuableList);
//        mutuableList.add("orange");
//        mutuableList.set(2, "yellow");
//        System.out.println(mutuableList);
//        System.out.println("-------------------------------------------------");
        record Product(String name,String category, int price){}
        Stream<Product> products=Stream.of(new Product("bat","sportsitem",4000),
                new Product("bails","sportsitem",4000),
                new Product("ball","sportsitem",2000),
                new Product("mobile","item",14000),
                new Product("banana","fruit",200),
                new Product("apple","fruit",300));
//        Grouping products by category
//        Map<String,List<Product>> categoryMap= products.collect(Collectors.groupingBy(Product::category));
//        System.out.println(categoryMap);

//        Aggregating based on category
//        Map<String, Integer> pricing=products.collect(Collectors.groupingBy(Product::category, Collectors.summingInt(Product::price)));
//        System.out.println(pricing);
//        Map<String,Double> avg=products.collect(Collectors.groupingBy(Product::category, Collectors.averagingDouble(Product::price)));
//        System.out.println(avg);

//        Filtering
//        List<Product> filtered= products.filter(Product->Product.price>2500).collect(Collectors.toList());
//        System.out.println(filtered);

//        Mapping extracting products fields
//        var extractfields=products.map(Product::price).toList();
//        System.out.println(extractfields);

//        Partition based on condition
//        Map<Boolean,List<Product>> part=products.collect(Collectors.partitioningBy(Product->Product.price>1000));
//        System.out.println(part);

//        summarizing every thing using summarizingInt it will give count, max, min, sum, avg
//        System.out.println(products.collect(Collectors.summarizingInt(Product::price)));

    }
}
