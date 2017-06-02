#### TODO
##### 后台
- 请求进入前判断请求类型及token值
- 请求结束根据情况加入token值
- 后台安全吗？？？？？？
- user对象的有效性？？？ 如果SecretKey正确，说明token值没有没改过[?],说明userId是正确的？ 这样做能确保吗[?]
- 对于集群来说会存在跨域问题
-

##### 前端
- 请求的封装token， resource的位置处理，抽离出单一的类做token处理
- token 置于header里 axios的config的auth属性
- 数据分装
- 如果用loaclStorage， 在次访问时token依旧存在
-


##### 请求流程
- 第一个页面的校验
  1. 拦截所有URL（／user/login除外），重定向或转发到相应的URL
  2. 开放 ／user/login 作为入口
  3. 如果是登陆页面，并带有正确的token，跳到首页；否则跳转登陆页（处理以前登陆过的情况）
-   


参考连接


- [axios 文档](https://github.com/mzabriskie/axios)