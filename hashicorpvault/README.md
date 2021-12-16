# spring-vault-config-example

# write : 
vault kv put secret/spring-vault java.username=yogi java.password=pass

# read : 
vault kv get secret/spring-vault

# Delete: 
vault kv delete secret/spring-vault
