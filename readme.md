

# 概述

    处理null



# 默认值式处理

作用
    
    出现null时,使用默认值进行替代

可空初始化     

    ofNullable

数据处理

    filter(过滤)
    map(转换)    

默认值设置

    orElse
    作用
        流中的数据为null时，则会使用orElse中的值进行返回
    注意
        无论流中数据是否出现null，orElse的值都会被计算，不会逻辑短路
        流中出现非空指针异常时，将直接报错 
    

示例

    Optional.ofNullable(value)
            .filter(list -> list.size() > 0)
            .map(list -> list.get(0))
            .orElse(null);

# 异常式处理

    出现null时,抛出自定义异常

    of
    
    get
    
    orElseThrow
        
    
# 参考

    https://www.sohu.com/a/162004423_274163  
    https://www.cnblogs.com/yizhiamumu/p/8999482.html      