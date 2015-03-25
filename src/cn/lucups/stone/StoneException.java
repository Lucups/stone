package cn.lucups.stone;

import cn.lucups.stone.ast.ASTree;

/**
 * “Ï≥£
 */
public class StoneException extends RuntimeException {

    public StoneException(String m) {
        super(m);
    }

    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }
}
