// Este kata recoge dos valores: tu fecha de nacimiento y un año de tu elección.
// En función del año escogido te dice que edad tendrás o cuanto queda para que nazcas dicho año.
// Probablemente haya formas de optimizar el código, en mi caso lo he resuelto así.

public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    if (yearTo == birth){
      return "You were born this very year!";
	  } else if (yearTo - birth == -1) {
      return "You will be born in 1 year.";
    } else if (yearTo - birth == 1) {
      return "You are 1 year old.";
    } else if (birth < yearTo) {
      return "You are " + Integer.toString(yearTo - birth) + " years old.";
    } else {
      return "You will be born in " + Integer.toString(birth - yearTo) + " years.";
    }
  }
}
