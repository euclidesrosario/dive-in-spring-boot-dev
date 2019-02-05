package com.imooc.diveinspringboot;
import com.imooc.diveinspringboot.jl.spring.model.Text;
import com.imooc.diveinspringboot.jl.spring.model.TextFile;
import java.util.List;

public interface ICatagoryOperation {
    int insertCatagory(String text_content);
    List<Text> findAllByLikeContent(String Key);
    int insertFile(TextFile file);
}
