package edu.nf.shopping.goods.advice;

import edu.nf.shopping.goods.exception.GoodsException;
import edu.nf.shopping.vo.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Achine
 * @date 2019/11/14
 */
@ControllerAdvice({"edu.nf.shopping.goods.controller"})
public class ControllerAspect {

    @ExceptionHandler(GoodsException.class)
    @ResponseBody
    public ResponseVO loginException(GoodsException e){
        ResponseVO vo = new ResponseVO();
        vo.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        vo.setMessage(e.getMessage());
        return vo;
    }

}
