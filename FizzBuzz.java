class FizzBuzz{
  public static void main(String[] args) {

    for (int i=1 ; i<=100  ; i++ )
    {

      if (i % 15 == 0){ //3でも5でも割り切れるとき
        System.out.print("FizzBuzz ");
      }else if (i % 5 == 0){  //5で割り切れるとき
        System.out.print("Buzz ");
      }else if (i % 3 == 0) { //3で割り切れるとき
        System.out.print("Fizz ");
      }else{
        System.out.print(i + " ");
      }

    }

  }
}
