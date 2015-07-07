package utfpr.ct.dainf.if62c.avaliacao;

import java.util.Comparator;

/**
 * IF62C Fundamentos de Programação 2 Avaliação parcial.
 *
 * @author
 */
public class LancamentoComparator implements Comparator<Lancamento> {

    @Override
    public int compare(Lancamento o1, Lancamento o2) {
        
        int i= 0;
        
        if (o1.getConta() == o2.getConta()) {
                
            
            if (o1.getData().getTime() > o2.getData().getTime()) {
                i = 0;
            } else if (o1.getData().getTime() == o2.getData().getTime()) {
                i = 1;
            } else {
                i = -1;
            }
        } else if (o1.getConta() > o2.getConta()) {
            i = 1;
        } else {
            i = -1;
        }
        return i;
    }
}
