package ch.ex16.local;

/**
 * Created by V1 on 13-Feb-17.
 */
public interface I4 extends I1 {  // конфликт  I1 {int f()}  и I3 { void f()}

}
//public interface I4 extends I1,I3 {  // конфликт  I1 {int f()}  и I3 { void f()}
//
//}
