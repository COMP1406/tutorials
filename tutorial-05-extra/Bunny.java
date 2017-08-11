public class Bunny implements Comparable<Bunny> {
  /* attributes */
  private String name;
  private int    age;
  
  /* getters for hidden attributes */
  public String getName(){ return this.name; }
  public int    getAge(){ return this.age; }
  
  /* setters for hidden attributes */
  public void setName(String n){ this.name = n; }
  public void setAge(int a){ this.age = a; }
  
  
  /* constructor */
  public Bunny(String name, int age){
    setName(name);
    setAge(age);
  }
  
  /* define the compateTo(Bunny) method */
  @Override
  public int compareTo(Bunny other){
    int compName = this.getName().compareTo(other.getName());
    if(compName == 0){
      return this.getAge() - other.getAge();
    }
    return compName;
  }
  
  /* override Object's equals method */
  @Override
  public boolean equals(Object other){
    if( other != null && other instanceof Bunny ){
      /* if other is not null AND other is a Bunny */
      
      /* cast other back into a Bunny (it is an Obect) */
      Bunny o = (Bunny) other;
      
      /* return true if both bunnies have the same name AND age */
      return ( this.getName().equals( o.getName()) 
        && this.getAge() == o.getAge() );
    }
    
    /* other was null OR other was not a bunny */
    return false;
  }
  
  /* override the toString() method */
  @Override
  public String toString(){
    return this.getName() + "(" + this.getAge() + ")";
  }
}
  