/**
 * 
 */
package main.java.br.com.rpires.dao.generic.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.br.com.rpires.dao.generic.jdbc.ConnectionFactory;
import main.java.br.com.rpires.domin.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAO implements IClienteDAO {

	@Override
	public Integer cadastrar(Cliente cliente) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlInsert();
			stm = connection.prepareStatement(sql);
			adicionarParametrosInsert(stm, cliente);
			return stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
	}

	@Override
	public Integer atualizar(Cliente cliente) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlUpdate();
			stm = connection.prepareStatement(sql);
			adicionarParametrosUpdate(stm, cliente);
			return stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
	}

	@Override
	public Cliente buscar(Integer id) throws Exception {
	    Connection connection = null;
	    PreparedStatement stm = null;
	    ResultSet rs = null;
	    Cliente cliente = null;
	    try {
	        connection = ConnectionFactory.getConnection();
	        String sql = getSqlSelect();
	        stm = connection.prepareStatement(sql);
	        stm.setInt(1, id); // Defina o ID como parâmetro da consulta
	        rs = stm.executeQuery();

	        if (rs.next()) {
	            cliente = new Cliente();
	            cliente.setId(rs.getInt("ID"));
	            cliente.setNome(rs.getString("NOME"));
	            cliente.setCpf(rs.getLong("CPF"));
	            cliente.setTelefone(rs.getLong("TEL"));
	            cliente.setEndereco(rs.getString("ENDERECO"));
	            cliente.setNumero(rs.getLong("NUMERO"));
	            cliente.setCidade(rs.getString("CIDADE"));
	            cliente.setEstado(rs.getString("ESTADO"));
	        }
	    } catch (Exception e) {
	        throw e;
	    } finally {
	        closeConnection(connection, stm, rs);
	    }
	    return cliente;
	}

	@Override
	public Integer excluir(Cliente cliente) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlDelete();
			stm = connection.prepareStatement(sql);
			adicionarParametrosDelete(stm, cliente);
			return stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
	}

	@Override
	public List<Cliente> buscarTodos() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		List<Cliente> list = new ArrayList<>();
		Cliente cliente = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlSelectAll();
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();

			while (rs.next()) {
				cliente = new Cliente();
				Integer id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				Long cpf = rs.getLong("CPF");
				Long telefone = rs.getLong("TEL");
				String endereco = rs.getString("ENDERECO");
				Long numero = rs.getLong("NUMERO");
				String cidade = rs.getString("CIDADE");
				String estado = rs.getString("ESTADO");

				cliente.setId(id);
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setTelefone(telefone);
				cliente.setEndereco(endereco);
				cliente.setNumero(numero);
				cliente.setCidade(cidade);
				cliente.setEstado(estado);

				list.add(cliente);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, rs);
		}
		return list;
	}

	private String getSqlInsert() {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO TB_CLIENTE (NOME, CPF, TEL, ENDERECO, NUMERO ,CIDADE, ESTADO) ");
		sb.append("VALUES (?, ?, ?, ?, ?, ?, ?)");
		return sb.toString();
	}

	private void adicionarParametrosInsert(PreparedStatement stm, Cliente cliente) throws SQLException {
		stm.setString(1, cliente.getNome());
		stm.setLong(2, cliente.getCpf());
		stm.setLong(3, cliente.getTelefone());
		stm.setString(4, cliente.getEndereco());
		stm.setLong(5, cliente.getNumero());
		stm.setString(6, cliente.getCidade());
		stm.setString(7, cliente.getEstado());
	}

	private String getSqlUpdate() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("UPDATE TB_CLIENTE ");
	    sb.append("SET NOME = ? ");
	    sb.append("WHERE ID = ?");
	    return sb.toString();
	}


	private void adicionarParametrosUpdate(PreparedStatement stm, Cliente cliente) throws SQLException {
		stm.setString(1, cliente.getNome());
		stm.setLong(2, cliente.getId());

	}

	private String getSqlDelete() {
		StringBuilder sb = new StringBuilder();
		sb.append("DELETE FROM TB_CLIENTE ");
		sb.append("WHERE ID = ?");
		return sb.toString();
	}

	private void adicionarParametrosDelete(PreparedStatement stm, Cliente cliente) throws SQLException {
		stm.setLong(1, cliente.getId());
	}

	private String getSqlSelect() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM TB_CLIENTE ");
		sb.append("WHERE ID = ?");
		return sb.toString();
	}

	private void adicionarParametrosSelect(PreparedStatement stm, Integer id) throws SQLException {
		stm.setInt(1, id);
	}

	private String getSqlSelectAll() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM TB_CLIENTE");
		return sb.toString();
	}

	private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
