package ch.ex18.local;

/**
 * Created by V1 on 14-Feb-17.
 */
public interface E {
    interface IGPublic {  // interface G
        void f();
    }

    interface IHPublic {   // interface H  public по умолчаню другого доступа нет
        void f();
    }

    void g();  // interface E
}
