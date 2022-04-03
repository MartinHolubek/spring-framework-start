package com.lankaris.spring.basics.springin5steps.basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {


    @Autowired
    private SortAlgorithm sortAlgorithm;

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        super();
        sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] array, int numberToSearchfor){

        return 3;
    }
}
