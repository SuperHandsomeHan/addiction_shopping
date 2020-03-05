package edu.nf.shopping.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Achine
 * @date 2020/3/5
 */
@Configuration
@EnableCaching
public class RedisConfig {
    /**
     * 装配RedisCacheManager，这里初始化了cache1和cache2两个缓存，并存入Map中,
     * 后续在使用时可以指定操作哪一个缓存。
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public RedisCacheManager redisCacheManager(RedisConnectionFactory redisConnectionFactory) {
        Map<String, RedisCacheConfiguration> map = new HashMap<>(2);
        map.put("cache1", initRedisCacheConfiguration(1800L));
        map.put("cache2", initRedisCacheConfiguration(3600L));
        RedisCacheManager cacheManager = RedisCacheManager.builder(redisConnectionFactory)
                .withInitialCacheConfigurations(map)
                .build();
        return cacheManager;
    }

    /**
     * Redis缓存配置，配置相关的key和value序列化器以及缓存过期时间
     * serializeKeysWith()方法用于设置key的序列化器
     * serializeValuesWith()方法用于设置value的序列化器
     * entryTtl()方法用于设置过期时间
     * @param ttl
     * @return
     */
    private RedisCacheConfiguration initRedisCacheConfiguration(Long ttl) {
        RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
        return cacheConfiguration
                //设置key的序列化器
                .serializeKeysWith(
                        RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
                //设置value的序列化器
                .serializeValuesWith(
                        RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                //设置缓存过期时间
                .entryTtl(Duration.ofSeconds(ttl));
    }
}
