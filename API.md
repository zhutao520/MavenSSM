# MavenSSM 接口文档

## 基本信息

- 应用名称：`maven-ssm`
- 默认访问前缀：`/maven-ssm`
- 控制器前缀：`/api`

> 默认访问前缀来自 Maven 的 `finalName`。实际部署时可由 Tomcat 的 Context 配置覆盖。

## 获取用户数据

| 项目 | 内容 |
| --- | --- |
| 接口路径 | `/maven-ssm/api/getUsers` |
| 请求方法 | `GET` |
| 请求参数 | 无 |
| 请求体 | 无 |
| 响应类型 | `text/plain` |
| 成功响应 | `/s` |

### 请求示例

```http
GET /maven-ssm/api/getUsers HTTP/1.1
Host: localhost:8080
```

```bash
curl http://localhost:8080/maven-ssm/api/getUsers
```

### 响应示例

```text
/s
```

### 实现说明

接口会先调用 `UserService.getUserAll()` 查询用户列表，并把结果打印到服务端控制台，但不会将用户列表返回给客户端。当前客户端实际收到的内容固定为 `/s`。如果数据库连接或查询失败，接口会返回服务器错误。

## 源码位置

- 控制器：`maven_ssm/src/main/java/com/web/ssm/controller/UserController.java`
- 服务层：`maven_ssm/src/main/java/com/web/ssm/service/UserService.java`

## Apifox 导入

在 Apifox 中选择“导入项目 → OpenAPI/Swagger → 文件导入”，然后选择仓库根目录下的 `openapi.json`。
