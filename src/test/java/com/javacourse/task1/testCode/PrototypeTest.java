package com.javacourse.task1.testCode;

import com.javacourse.task1.patterns.maximpatterns.prototype.BasicDetail;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class PrototypeTest {
    BasicDetail basicDetail;
    BasicDetail prototype;


    @Test
    public void sizesShouldBeEquals(){
        basicDetail = new BasicDetail(10, "Detail");
        prototype=basicDetail.cloneObj();
        Assert.assertEquals(basicDetail.size, prototype.size);
    }

    @Test
    public void namesShouldBeEquals(){
        basicDetail = new BasicDetail(10, "Detail");
        prototype=basicDetail.cloneObj();
        Assert.assertEquals(basicDetail.name, prototype.name);
    }


}
