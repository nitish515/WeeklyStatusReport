package com.capgemini.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.beans.Stream;
import com.capgemini.beans.Project;;

public class DBUtils {
	public static Stream findStream(Connection connection, String streamName) throws SQLException{
		String sql = "select stream_id, stream_name from stream where stream_name = ? ";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, streamName);
		ResultSet resultSet = statement.executeQuery();
		if(resultSet.next()){
			Stream stream = new Stream();
			String stream_Name = resultSet.getString("stream_name");
			int stream_ID = resultSet.getInt("stream_id");
			stream.setStreamName(stream_Name);
			stream.setStreamID(stream_ID);
			return stream;
		}
		return null;
	}
	
	public static List<Project> findProjects(Connection connection, int stream_ID) throws SQLException{
		String sql = "select * from project where stream_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, stream_ID);
		ResultSet resultSet = statement.executeQuery();
		List <Project> list = new ArrayList<Project>();
		while(resultSet.next()){
			Project project = new Project();
			String projectName = resultSet.getString("project_name");
			String countryName = resultSet.getString("country_name");
			int projectID = resultSet.getInt("project_id");
			int streamID = resultSet.getInt("stream_id");
			project.setCountryName(countryName);
			project.setProjectID(projectID);
			project.setProjectName(projectName);
			project.setStreamID(streamID);
			list.add(project);
		}
		return list;
	}
}
