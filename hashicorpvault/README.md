# spring-vault-config-example

#to start the vault with token
vault server --dev --dev-root-token-id=00000000-0000-0000-0000-000000000000

open a new cmd and then execute below commands

# write : 
vault kv put secret/spring-vault java.username=yogi java.password=pass

# read : 
vault kv get secret/spring-vault

# Delete: 
vault kv delete secret/spring-vault

#status
vault status
