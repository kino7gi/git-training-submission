package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserSearchRequest;
import com.example.demo.dto.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;
import com.example.demo.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserRepository userRepository;
  
  @Autowired
  private UserMapper userMapper;


  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<User> searchAll() {
    return userRepository.findAll();
  }

  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(UserRequest userRequest) {
    Date now = new Date();
    User user = new User();
    user.setName(userRequest.getName());
    user.setAddress(userRequest.getAddress());
    user.setPhone(userRequest.getPhone());
    user.setCreateDate(now);
    user.setUpdateDate(now);
    userRepository.save(user);
  }
  /**
   * ユーザー情報 主キー検索
   * @return 検索結果
   */
  public User findById(Long id) {
    return userRepository.findById(id).get();
  }
  
  /**
   * ユーザー情報検索
　* @param userSearchRequest リクエストデータ
   * @return 検索結果
   */
  public User search(UserSearchRequest userSearchRequest) {
      return userMapper.search(userSearchRequest);
  }
  /**
   * ユーザー情報 更新
   * @param userUpdateRequest 更新リクエストデータ
   */
  public void update(UserUpdateRequest userUpdateRequest) {
    // 1. まず、送られてきたIDをもとに現在のデータをDBから取得する
    User user = userRepository.findById(userUpdateRequest.getId()).get();
    
    // 2. 画面から送られてきた内容（Request）を、DB用のクラス（Entity）に詰め替える
    user.setName(userUpdateRequest.getName());
    user.setAddress(userUpdateRequest.getAddress());
    user.setPhone(userUpdateRequest.getPhone());
    
    // 3. 更新日時を現在の時刻にセットする
    user.setUpdateDate(new Date());
    
    // 4. DBに保存する（JPAはIDが一致するデータがあれば「更新」してくれます）
    userRepository.save(user);
  }
}