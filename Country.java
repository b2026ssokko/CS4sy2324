public class Country {
  String name = "";
  int population = 0;
  String continent = "";
  
  public static void main(String[] args) {
    Country ph = new Country();
    ph.name = "Philippines";
    ph.population = 113900000;
    ph.continent = "Asia";
    System.out.println("Country 1");
    System.out.println(ph.name);
    System.out.println(ph.population);
    System.out.println(ph.continent);
      System.out.println("");
      
    Country jp = new Country();
    jp.name = "Japan";
    jp.population = 125700000;
    jp.continent = "Asia";
    System.out.println("Country 2");
    System.out.println(jp.name);
    System.out.println(jp.population);
    System.out.println(jp.continent);
      System.out.println("");
      
    Country it = new Country();
    it.name = "Italy";
    it.population = 59110000;
    it.continent = "Europe";
    System.out.println("Country 3");
    System.out.println(it.name);
    System.out.println(it.population);
    System.out.println(it.continent);
      System.out.println("");
      
    // Total population of PH, JP, and IT
    System.out.println("Total Population of PH, JP, and IT: " + (ph.population + jp.population + it.population));
    
    // Same continent comparison JP and IT
    System.out.println("Japan and Italy are on the same continent: " + jp.continent.equals(it.continent));
    
    // Population comparison PH and JP
    System.out.println("Japan has a greater population than the Philippines: " + (jp.population > ph.population));
  }
}
