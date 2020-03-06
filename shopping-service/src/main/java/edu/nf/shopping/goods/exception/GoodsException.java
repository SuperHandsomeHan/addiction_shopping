package edu.nf.shopping.goods.exception;

/**
 * @author Achine
 * @date 2020/3/6
 */
public class GoodsException extends RuntimeException {
    public GoodsException(String message) {
        super(message);
    }

    public GoodsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GoodsException(Throwable cause) {
        super(cause);
    }
}
