package ByCountryDataCount;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public abstract class DAO {
        public Connection conn;

        public abstract void creatConnection() throws Exception;

        public void close() throws SQLException {
            this.conn.close();
            System.out.println(" Database Connection closed now ...");
        }

        protected static void closeStatement(Statement stmt) {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        protected static void closeResultSet(ResultSet rs) {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


