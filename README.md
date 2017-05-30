####TODO
##### 后台
- 请求进入前判断请求类型及token值
- 请求结束根据情况加入token值
- 后台安全吗？？？？？？
- user对象的有效性？？？ 如果SecretKey正确，说明token值没有没改过[?],说明userId是正确的？ 这样做能确保吗[?]

##### 前端
- 请求的封装token， resource的位置处理，抽离出单一的类做token处理
- token 置于header里
- 数据分装
- 如果用loaclStorage， 在次访问时token依旧存在
-