package Vector;
import java.util.List;
public class Final {
    public static void main(String[] args) {
        List<Integer> vector = Vectoroperaciones.vec();
        Vectoroperaciones.mayor(vector);
        Vectoroperaciones.div(vector);
        Vectoroperaciones.rep(vector);
        Vectoroperaciones.pares(vector);
    }
}