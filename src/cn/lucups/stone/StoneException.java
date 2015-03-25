package cn.lucups.stone;

import cn.lucups.stone.ast.ASTree;

/**
 * �쳣
 */
public class StoneException extends RuntimeException {

    public StoneException(String m) {
        super(m);
    }

    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }
}
