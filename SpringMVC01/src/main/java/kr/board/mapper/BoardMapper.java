package kr.board.mapper;

import java.util.List;

import kr.board.entity.Board;

// @Mapper // -> Mybatis의 API	
public interface BoardMapper {
	public List<Board> getList();
}
