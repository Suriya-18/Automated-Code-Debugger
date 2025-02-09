import com.github.javaparser.*;
import com.github.javaparser.ast.*;

public class CodeDebugger {
    public static void main(String[] args) {
        String code = "public class Test { public void main() { System.out.println('Hello'); } }";
        CompilationUnit cu = JavaParser.parse(code);
        cu.getTypes().forEach(type -> {
            System.out.println("Class: " + type.getName());
        });
    }
}
