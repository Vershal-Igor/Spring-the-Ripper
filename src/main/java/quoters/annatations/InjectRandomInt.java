package quoters.annatations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {
    int min();
    int max();
}


/*Аннотация @Retention позволяет указать жизненный цикл аннотации:
 будет она присутствовать только в исходном коде, в скомпилированном файле,
  или она будет также видна и в процессе выполнения. Выбор нужного типа зависит от того,
   как вы хотите использовать аннотацию, например, генерировать что-то побочное из исходных кодов,
    или в процессе выполнения стучаться к классу через reflection.

RetentionPolicy.SOURCE - аннотация используется на этапе компиляции и должна отбрасываться компилятором;
RetentionPolicy.CLASS - аннтоация будет записана в class-файл компилятором, но не должна быть доступна во время выполнения (runtime);
RetentionPolicy.RUNTIME - аннотация будет записана в class-файл и доступна во время выполнения через reflection.
    */
